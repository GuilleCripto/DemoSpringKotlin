package com.spring.mongo.demo.controller;

import com.google.gson.Gson;
import com.spring.mongo.demo.dto.Vales2;
import com.spring.mongo.demo.dto.ValesItems2;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.spring.mongo.demo.model.Employee;
import com.spring.mongo.demo.service.EmployeeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.ArrayList;

import org.json.simple.JSONObject;

@RestController
@RequestMapping("/aimonkey")
@Api(value = "API para Buscar los empleados desde un repositorio, con diferentea parametros",
        description = "Esta API Buscar los empleados desde un repositorio, con diferentea parametros", produces = "application/json")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;

        @ApiOperation(value = "Consulta Todos Los Empleados", produces = "application/json")
        @RequestMapping(value = "/list", method = RequestMethod.GET)
      //  @GetMapping("/list")
	public List<Employee> getAll() {
		return employeeService.getAll();
	}
	
	@GetMapping
	public String getHome() {
		return "Aplicación Crud de Empleados Backend=>Spring Boot, Movil=>Kotlin ";
	}
	

	@GetMapping("/{empId}")
        @ApiOperation(value = "Busca los Empleados por id", produces = "application/json")
	public Employee getEmployeeById(@PathVariable int empId ) {
		return employeeService.getEmployeeById(empId);
	}
	
	@GetMapping("/firstName/{firstName}")
                @ApiOperation(value = "Consuta Empleado Por Nombres", produces = "application/json")
	public List<Employee> getEmployeeByName(@PathVariable String firstName ) {
		return employeeService.getEmployeeByFirstName(firstName);
	}

	// get employee by first name (equals())
	@GetMapping("/one-by-firstName/{firstName}")
                @ApiOperation(value = "Consuta Empleado Por Nombre Unico", produces = "application/json")
	public Employee getOneEmployeeByFirstName(@PathVariable String firstName) {
		return employeeService.getOneEmployeeByFirstName(firstName);
	}

	// get employee by first name %LIKE%
	@GetMapping("/firstName-like/{firstName}")
                @ApiOperation(value = "Consuta Todo Lo que coincide Con la cadena del Nombre", produces = "application/json")
	public List<Employee> getEmployeeByFirstNameLike(@PathVariable String firstName) {
		return employeeService.getEmployeeByFirstNameLike(firstName);
	}

	@GetMapping("/one-by-lastName/{lastName}")
                @ApiOperation(value = "Consuta Empleado Por Apellido", produces = "application/json")
	public Employee getEmployeeBylName(@PathVariable String lastName) {
		return employeeService.getEmployeeByLastName(lastName);
	}


	@GetMapping("/salary-greater-than/{salary}")
         @ApiOperation(value = "Consuta Empleado Por Sueldo", produces = "application/json")
	public List<Employee> getEmployeeBySalaryGreaterThan(@PathVariable int salary) {
		return employeeService.getEmployeeBySalaryGreaterThan(salary);
	}
	
	@PostMapping("/get-by-condition")
        @ApiOperation(value = "Consuta Empleado Por Status", produces = "application/json")
	public List<Employee> getEmployeeByCondition(@RequestBody Employee employee) {
		return employeeService.getEmployeeByCondition(employee);
	}
        
        @GetMapping(path = "/inicio")
       @ApiOperation(value = "Consuta Empleado Para la Aplicación Movil", produces = "application/json")
        public  Vales2 home() {


            List<JSONObject> entities = new ArrayList<JSONObject>();
            List<Employee> entityList = employeeService.getAll();
            List<ValesItems2> resultados = new ArrayList<>();
            for (Employee n : entityList) {
                 ValesItems2 valesItems = new ValesItems2(n.getEmpId(), n.getFirstName()+"@gmail.com",n.getLastName(), n.getLastName(), n.getLastName());
                 resultados.add(valesItems);
            }

            Vales2 vales = new Vales2(1, 2, 3, 4, resultados);
            Gson gson = new Gson();
            String json = gson.toJson(resultados);

            return vales;
            }

}




