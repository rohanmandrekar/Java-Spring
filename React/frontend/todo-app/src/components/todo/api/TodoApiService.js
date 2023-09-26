import axios from "axios"
import { useAuth } from "../security/AuthContext"

// export function retrieveHelloWorldBean(){
//     return axios.get('http://localhost:8080/hello-world-bean');
// }
// const authContext= useAuth()
const apiClient= axios.create(
    {
        baseURL: 'http://localhost:8080/'
    }
)

export const retrieveAllTodosForUsernameApi = (username) => apiClient.get(`http://localhost:8080/users/${username}/todos`,{ 
                                                                    headers:{Authorization: 'Basic cm9oYW46cm9oYW4='}})

export const retriveTodoByIdApi = (username, id)=> apiClient.get(`http://localhost:8080/users/${username}/todos/${id}`,{ 
    headers:{Authorization: 'Basic cm9oYW46cm9oYW4='}})

export const deleteTodoApi = (username, id) => apiClient.delete(`http://localhost:8080/users/${username}/todos/${id}`,{ 
    headers:{Authorization: 'Basic cm9oYW46cm9oYW4='}})

export const updateTodoApi = (username, id, todo) => apiClient.put(`http://localhost:8080/users/${username}/todos/${id}`, todo,{ 
    headers:{Authorization: 'Basic cm9oYW46cm9oYW4='}})

export const createTodoApi = (username, todo) => apiClient.post(`http://localhost:8080/users/${username}/todos`, todo,{ 
    headers:{Authorization: 'Basic cm9oYW46cm9oYW4='}}) 
