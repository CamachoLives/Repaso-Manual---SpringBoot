package consumo.api.RestRickAndMorty.Client;
import consumo.api.RestRickAndMorty.DTO.CharacterDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;
import java.util.List;

@RequiredArgsConstructor
@Component
public class RmRestClient {

    private final RestClient restclient;

    public List<CharacterDTO>  getcharacters(){
        return restclient.getfindall();
    }


    public CharacterDTO getcharacter(String id){
        return restclient.findbyid(id);
    }

}
