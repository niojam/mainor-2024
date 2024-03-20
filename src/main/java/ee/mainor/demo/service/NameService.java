package ee.mainor.demo.service;

import ee.mainor.demo.dto.NameRequest;
import ee.mainor.demo.dto.NameResponse;
import org.springframework.stereotype.Service;

@Service
public class NameService {

    public NameResponse getFullName(NameRequest nameRequest){
        NameResponse nameResponse = new NameResponse();
        nameResponse.setFullName(nameRequest.getFirstName()+" "+ nameRequest.getLastName());
        return nameResponse;
    }
}
