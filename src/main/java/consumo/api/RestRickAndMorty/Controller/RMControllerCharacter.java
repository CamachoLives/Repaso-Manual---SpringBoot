package consumo.api.RestRickAndMorty.Controller;
import consumo.api.RestRickAndMorty.DTO.CharacterDTO;
import consumo.api.RestRickAndMorty.Service.RMService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@Mapping("/Api")
@RestController
@GetMapping
public class RMControllerCharacter {

    private RMService rmservice;

        @GetMapping
        public List<CharacterDTO> findusers(@RequestParam = false){
            return rmservice.getcharacters();
        }


        @GetMapping
        public CharacterDTO findusersbyID(@RequestParam = true,  Long  id){
            return rmservice.getcharacters("/{$ID}", Long id);
        }


}
