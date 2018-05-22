import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import model.Relation;

public class TestRelation {
	Relation r;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Testing start");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Testing end");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Infomation input");
		r=new Relation("Maison","Kitty","Couple");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Infomation output");
	}

	@Test
	public void testGetFirstName(){
		assertEquals("Maison",r.getFirstName());
	}
	
	@Test
	public void testSetFirstName(){
		r.setFirstName("Test");
		assertEquals("Test",r.getFirstName());
	}
	
	@Test
	public void testGetSecondName(){
		assertEquals("Kitty",r.getSecondName());
	}
	
	@Test
	public void testSetSecondName(){
		r.setFirstName("Test");
		assertEquals("Test",r.getSecondName());
	}
	
	@Test
	public void testGetRelationship(){
		assertEquals("Couple",r.getRelationship());
	}
	
	@Test
	public void testSetRelationship(){
		r.setRelationship("Friend");
		assertEquals("Friend",r.getRelationship());
	}

}
