package com.assignment.restfulemployee.RESTApi.Resource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.assignment.restfulemployee.RESTApi.Entity.Employee;

@Path("/employees")
public class EmployeeResource {

	private static Map<Integer, Employee> employeeMap = new HashMap<Integer, Employee>();
	static {
		Employee emp1 = new Employee(1, "Lina", "Tran", "ltran4997@conestogac.on.ca", "2024-02-04", 70000.00F);
		Employee emp2 = new Employee(2, "Ren", "Tendou", "rtendou@hotmail.com", "2023-05-01", 80000.00F);
		Employee emp3 = new Employee(3, "Celes", "Stargazer", "starsShine@gmail.com", "2024-02-04", 70000.00F);

		employeeMap.put(emp1.getId(), emp1);
		employeeMap.put(emp2.getId(), emp2);
		employeeMap.put(emp3.getId(), emp3);
	}

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String hello() {
		return "Welcome To Employee Management System";
	}

	@GET
	@Path("/all")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Employee> listBooks() {
		return new ArrayList<>(employeeMap.values());
	}

	@GET
	@Path("/employee/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee getEmployee(@PathParam("id") int employeeId) {
		System.out.println("Get called "+ employeeId);
		return employeeMap.get(employeeId);
	}

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Employee createEmployee(Employee employee) {
		employeeMap.put(employee.getId(), employee);
		return employeeMap.get(employee.getId());
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response deleteEmployee(@PathParam("id") int employeeId) {
		employeeMap.remove(employeeId);
		return Response.noContent().build();
	}

	@PUT
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public Response updateEmployee(@PathParam("id") int employeeId, Employee employee) {
		employee.setId(employeeId);
		employeeMap.put(employeeId, employee);
		if (employeeMap.get(employee.getId()) == null) {
			return Response.status((404)).build();
		} else {
			return Response.ok(employeeMap.get(employee.getId())).build();
		}
	}
}
