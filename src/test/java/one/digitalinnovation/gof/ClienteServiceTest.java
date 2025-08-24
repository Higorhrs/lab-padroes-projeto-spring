package one.digitalinnovation.gof;

import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import one.digitalinnovation.gof.model.ClienteRepository;
import one.digitalinnovation.gof.model.EnderecoRepository;
import one.digitalinnovation.gof.service.impl.ClienteServiceImpl;

public class ClienteServiceTest {
	
	@Mock
	private ClienteRepository clienteRepositoty;
	
	@Mock
	private EnderecoRepository enderecoRepository; 
	
	@Mock
	private ClienteServiceImpl clienteService;
	
	@BeforeEach
	void setUp() {
		MockitoAnnotations.openMocks(this);
	}

}
