package com.spring.mongo.demo.utils;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.spring.mongo.demo.model.Employee;

public class HelperUtil {

    private HelperUtil() {
    }
    
   

    public static Supplier<List<Employee>> employeeSupplier = () ->
            Arrays.asList(
		            Employee.builder().empId(1).firstName("Jose").lastName("Yanez (Creador de Esta App ").avatar("").salary(2000.0f).build(),
		            Employee.builder().empId(2).firstName("Bill").lastName("Gates (Creador de Window))").avatar("https://myhero.com/images/guest/g263998/hero90122/Bill-Gates1.jpg").salary(5000.0f).build(),
                            Employee.builder().empId(2).firstName("Step").lastName("job (Creador de Mac)").avatar("https://myhero.com/images/guest/g263998/hero90122/Bill-Gates1.jpg").salary(5000.0f).build(),
		            Employee.builder().empId(4).firstName("Tim").lastName("Berners-Lee").avatar("data:image/jpeg;base64,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").salary(6000.0f).build(),
		            Employee.builder().empId(5).firstName("Larry").lastName("Page").avatar("").salary(7000.0f).build(),
		            Employee.builder().empId(6).firstName("Mark").lastName("Zuckerberg").avatar("").salary(8000.0f).build(),
		            Employee.builder().empId(7).firstName("Jeff").lastName("Bezos").avatar("").salary(9000.0f).build()
		
            );

}
