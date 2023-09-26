import axios from "axios"

// export function retrieveHelloWorldBean(){
//     return axios.get('http://localhost:8080/hello-world-bean');
// }
// const authContext= useAuth()
const apiClient= axios.create(
    {
        baseURL: 'http://localhost:8080/'
    }
)

export const retrieveAllTodosForUsernameApi = (username,token) => apiClient.get(`http://localhost:8080/users/${username}/todos`,{ 
                                                                    headers:{Authorization: token}})

export const retriveTodoByIdApi = (username, id,token)=> apiClient.get(`http://localhost:8080/users/${username}/todos/${id}`,{ 
    headers:{Authorization: token}})

export const deleteTodoApi = (username, id,token) => apiClient.delete(`http://localhost:8080/users/${username}/todos/${id}`,{ 
    headers:{Authorization: token}})

export const updateTodoApi = (username, id, todo,token) => apiClient.put(`http://localhost:8080/users/${username}/todos/${id}`, todo,{ 
    headers:{Authorization: token}})

export const createTodoApi = (username, todo,token) => apiClient.post(`http://localhost:8080/users/${username}/todos`, todo,{ 
    headers:{Authorization: token}}) 
