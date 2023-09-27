
import { apiClient } from "./ApiClient"
// export function retrieveHelloWorldBean(){
//     return axios.get('http://localhost:8080/hello-world-bean');
// }
// const authContext= useAuth()


export const retrieveAllTodosForUsernameApi = (username) => apiClient.get(`http://localhost:8080/users/${username}/todos`)

export const retriveTodoByIdApi = (username, id)=> apiClient.get(`http://localhost:8080/users/${username}/todos/${id}`)

export const deleteTodoApi = (username, id) => apiClient.delete(`http://localhost:8080/users/${username}/todos/${id}`)

export const updateTodoApi = (username, id, todo) => apiClient.put(`http://localhost:8080/users/${username}/todos/${id}`, todo)

export const createTodoApi = (username, todo) => apiClient.post(`http://localhost:8080/users/${username}/todos`, todo) 
