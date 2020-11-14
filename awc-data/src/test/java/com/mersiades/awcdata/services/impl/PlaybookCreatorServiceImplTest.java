package com.mersiades.awcdata.services.impl;

import com.mersiades.awcdata.enums.Playbooks;
import com.mersiades.awcdata.models.PlaybookCreator;
import com.mersiades.awcdata.repositories.PlaybookCreatorRepository;
import com.mersiades.awcdata.services.PlaybookCreatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

class PlaybookCreatorServiceImplTest {

    public static final String MOCK_PC_ID_1 = "mock-pc-id-1";
    
    @Mock
    PlaybookCreatorRepository pcRepository;

    PlaybookCreatorService pcService;

    PlaybookCreator mockPc1;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);

        mockPc1 = PlaybookCreator.builder()
                .id(MOCK_PC_ID_1)
                .playbookType(Playbooks.ANGEL)
                .build();

        pcService = new PlaybookCreatorServiceImpl(pcRepository);
    }

    @Test
    void shouldFindAllPlaybookCreators() {
        // Given
        PlaybookCreator mockPc2 = PlaybookCreator.builder().build();
        when(pcRepository.findAll()).thenReturn(Flux.just(mockPc1, mockPc2));

        // When
        List<PlaybookCreator> returnedPlaybookCreators = pcService.findAll().collectList().block();

        // Then
        assert returnedPlaybookCreators != null;
        assertEquals(2, returnedPlaybookCreators.size());
        verify(pcRepository, times(1)).findAll();
    }

    @Test
    void shouldFindPlaybookCreatorById() {
        // Given
        when(pcRepository.findById(anyString())).thenReturn(Mono.just(mockPc1));

        // When
        PlaybookCreator returnedPlaybookCreator = pcService.findById(MOCK_PC_ID_1).block();

        // Then
        assert returnedPlaybookCreator != null;
        assertEquals(MOCK_PC_ID_1, returnedPlaybookCreator.getId());
        verify(pcRepository, times(1)).findById(anyString());
    }

    @Test
    void shouldSavePlaybookCreator() {
        // Given
        when(pcRepository.save(any(PlaybookCreator.class))).thenReturn(Mono.just(mockPc1));

        // When
        PlaybookCreator savedNpc = pcService.save(mockPc1).block();

        // Then
        assert savedNpc != null;
        assertEquals(mockPc1.getId(), savedNpc.getId());
        verify(pcRepository, times(1)).save(any(PlaybookCreator.class));
    }

//    @Test
//    void shouldSaveAllPlaybookCreators() {
//        // Given
//
//        // When
//
//        // Then
//    }

    @Test
    void shouldDeletePlaybookCreator() {
        // When
        pcService.delete(mockPc1);

        // Then
        verify(pcRepository, times(1)).delete(any(PlaybookCreator.class));
    }

    @Test
    void shouldDeletePlaybookCreatorById() {
        // When
        pcService.deleteById(MOCK_PC_ID_1);

        // Then
        verify(pcRepository, times(1)).deleteById(anyString());
    }

    @Test
    void shouldFindPlaybookCreatorByPlaybookType() {
        // Given
        when(pcRepository.findByPlaybookType(any(Playbooks.class))).thenReturn(Mono.just(mockPc1));

        // When
        PlaybookCreator returnedPlaybookCreator = pcService.findByPlaybookType(Playbooks.ANGEL).block();

        // Then
        assert returnedPlaybookCreator != null;
        assertEquals(mockPc1.getId(), returnedPlaybookCreator.getId());
        verify(pcRepository, times(1)).findByPlaybookType(any(Playbooks.class));
    }
}