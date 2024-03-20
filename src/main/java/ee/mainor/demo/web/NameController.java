package ee.mainor.demo.web;

import ee.mainor.demo.dto.NameRequest;
import ee.mainor.demo.dto.NameResponse;
import ee.mainor.demo.service.NameService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class NameController {
    private final NameService nameService;
    @PostMapping("name")
    public NameResponse name(@RequestBody NameRequest nameRequest){
        return nameService.getFullName(nameRequest);
    }

}
