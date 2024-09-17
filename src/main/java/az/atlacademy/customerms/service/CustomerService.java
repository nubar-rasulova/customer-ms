package az.atlacademy.customerms.service;

import az.atlacademy.customerms.model.request.SaveCustomerDto;
import az.atlacademy.customerms.model.response.CustomerResponseDto;


public interface CustomerService {
    void saveCustomer(SaveCustomerDto dto);
    CustomerResponseDto getCustomerById(Long id);


}
