import axios from "axios";

// Set the correct backend URL
const api = axios.create({
  baseURL: "http://localhost:8081", // Change to match backend port
  headers: {
    "Content-Type": "application/json"
  }
});

class EmployeeService {
  /** Method to get all employees */
  async getAllEmployee() {
    try {
      const response = await api.get("/employee");
      console.log("Employees fetched:", response.data);
      return response.data;
    } catch (error) {
      console.error("Error fetching employees:", error);
    }
  }

  /** Method to save employee */
  saveEmployee(employeeData) {
    return api.post("/employee/save", employeeData);
  }

  /** Method to update employee */
  updateEmployee(id, employeeData) {
    return api.put(`/employee/${id}`, employeeData);
  }

  /** Method to get employee by ID */
  getEmployeeById(id) {
    return api.get(`/employee/${id}`);
  }

  /** Method to delete employee */
  deleteEmployee(id) {
    return api.delete(`/employee/${id}`);
  }
}

export default new EmployeeService();
