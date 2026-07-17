package com.gayathri;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import org.junit.Test;

public class MyServiceTest {
    
    @Test
    public void testExternalApi(){
        ExternalApi mockapi=mock(ExternalApi.class);
        when(mockapi.getData()).thenReturn("Mock Data");
        MyService service=new MyService(mockapi);
        String result=service.fetchData();
        assertEquals("Mock Data",result);
    }

    @Test
    public void testVerifyInteraction(){
        ExternalApi mockApi=mock(ExternalApi.class);
        MyService service=new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
}
