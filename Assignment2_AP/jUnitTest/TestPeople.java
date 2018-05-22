import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import model.People;

public class TestPeople {
	People p;
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
		p=new People("Tom", "InRmit", "M", 14, "QV", "");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Infomation output");
	}

	@Test
	public void testGetStatus() {
		assertEquals("InRmit",p.getStatus());
	}
	
	@Test
	public void testSetStatus() {
		p.setStatus("LeaveRmit");
		assertEquals("LeaveRmit",p.getStatus());
	}
	
	@Test
	public void testGetUserName() {
		assertEquals("Tom",p.getUserName());
	}
	
	@Test
	public void testSetUserName() {
		p.setUserName("TestName");
		assertEquals("TestName",p.getUserName());
	}
	
	@Test
	public void testGetSex() {
		assertEquals("M",p.getSex());
	}
	
	@Test
	public void testSetSex() {
		p.setSex("F");
		assertEquals("F",p.getSex());
	}
	
	@Test
	public void testGetAge() {
		assertEquals(14,p.getAge());
	}
	
	@Test
	public void testSetAge() {
		p.setAge(55);
		assertEquals(55,p.getAge());
	}
	
	@Test
	public void testGetState() {
		assertEquals("QV",p.getState());
	}
	
	@Test
	public void testSetState() {
		p.setState("Test");
		assertEquals("Test",p.getState());
	}
	

}
