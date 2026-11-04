import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

import week11.Graph;

public class TestGraph{
    public Graph<String> createMap(){
        Graph<String> map=new Graph();
        map.addEdge("LAX", "LGA");
        map.addEdge("BUF", "LGA");
        map.addEdge("NRT", "LGA");
        map.addEdge("BUF", "LAX");
        map.addEdge("LGA", "LAX");
        map.addEdge("EWR", "LAX");
        map.addEdge("NRT", "LAX");
        map.addEdge("EWR", "NRT");
        map.addEdge("LGA", "EWR");
        map.addEdge("LGA", "BUF");
        map.addEdge("EWR", "BUF");
        return map;
    }
    @Test
    public void testSingleLocation(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF"));
        assertEquals("Test single valid location",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("BOB"));
        assertEquals("Test single invalid location",false,map.isValidPath(path1));
    }

    @Test
    public void testEmptyPath(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>();
        assertEquals("Test empty path",false,map.isValidPath(path1));

        path1=null;
        assertEquals("Test null path",false,map.isValidPath(path1));
    }

    @Test
    public void testValidPairs(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","LGA"));
        assertEquals("Test valid 2 location path",true,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","LAX"));
        assertEquals("Test valid 2 location path",true,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("LAX","LGA"));
        assertEquals("Test valid 2 location path",true,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","LGA"));
        assertEquals("Test valid 2 location path",true,map.isValidPath(path1));
    }

    @Test
    public void testInValidPairs(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","NRT"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","EWR"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("EWR","LGA"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","BUF"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));
    }

    @Test
    public void testInValidLocationPairs(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","LLL"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("QWE","EWR"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("POW","WOP"));
        assertEquals("Test invalid 2 location path",false,map.isValidPath(path1));
    }

    @Test
    public void testLongValidPath(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","LGA","LAX"));
        assertEquals("Test valid 3 location path",true,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","LAX","LGA","EWR"));
        assertEquals("Test valid 4 location path",true,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("LAX","LGA","EWR","NRT","LGA"));
        assertEquals("Test valid 5 location path",true,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","LGA","BUF","LAX","LGA"));
        assertEquals("Test valid 5 location path",true,map.isValidPath(path1));
    }

    @Test
    public void testLongInValidPathFirstFail(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("EWR","LGA","LAX"));
        assertEquals("Test invalid 3 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("BUF","NRT","LGA","EWR"));
        assertEquals("Test invalid 4 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("EWR","LGA","EWR","NRT","LGA"));
        assertEquals("Test invalid 5 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("EWR","LGA","BUF","LAX","LGA"));
        assertEquals("Test invalid 5 location path",false,map.isValidPath(path1));
    }

        @Test
    public void testLongInValidPathLastFail(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","LGA","NRT"));
        assertEquals("Test invalid 3 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("EWR","NRT","LGA","NRT"));
        assertEquals("Test invalid 4 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","LGA","EWR","NRT","BUF"));
        assertEquals("Test invalid 5 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","LGA","BUF","LAX","NRT"));
        assertEquals("Test invalid 5 location path",false,map.isValidPath(path1));
    }
    @Test
    public void testLongInValidPathMiddleFail(){
        Graph<String> map=createMap();

        ArrayList<String> path1=new ArrayList<>(Arrays.asList("BUF","NRT","EWR"));
        assertEquals("Test invalid 3 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("EWR","NRT","LAX","LGA"));
        assertEquals("Test invalid 4 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","LGA","NRT","LAX","LGA"));
        assertEquals("Test invalid 5 location path",false,map.isValidPath(path1));

        path1=new ArrayList<>(Arrays.asList("NRT","LGA","BUF","EWR","NRT"));
        assertEquals("Test invalid 5 location path",false,map.isValidPath(path1));
    }
}