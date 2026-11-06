package consumo.api.RestRickAndMorty.Service;

import consumo.api.RestRickAndMorty.DTO.CharacterDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

import java.lang.reflect.Array;
import java.util.List;

import static jdk.internal.org.jline.reader.impl.LineReaderImpl.CompletionType.List;

@Component
public class RMService {

    private RestClient restClient;

    public List<CharacterDTO> getcharacters() {


        public characters New Characteres = List<CharacterDTO> restClient.getcharacters();

        if( Characteres == null || Characteres.empty() ){
            return List<CharacterDTO>
        }

        return Characteres;
    }



}
