package com.northstar.crm;

import com.northstar.crm.dto.CustomerRequest;
import com.northstar.crm.dto.CustomerResponse;
import com.northstar.crm.entity.Customer;

public class StructureDemo {
    public static void main(String[] args) {
        CustomerRequest request = new CustomerRequest("Amina Khan", "amina@example.test");

        // TODO: build Customer entity from request (assign an id + ACTIVE status)
        Customer entity = _____;

        // TODO: map entity → CustomerResponse
        CustomerResponse response = _____;

        System.out.println(response.summary());
    }
}
