import axios from "axios"

// export function retrieveHelloWorldBean(){
//     return axios.get('http://localhost:8080/hello-world-bean');
// }

const apiClient= axios.create(
    {
        baseURL: 'http://localhost:8080/'
    }
)

export const retrieveAllTodosForUsernameApi = (username) => apiClient.get(`http://localhost:8080/users/${username}/todos`)

export const retriveTodoByIdApi = (username, id)=> apiClient.get(`http://localhost:8080/users/${username}/todos/${id}`)

export const deleteTodoApi = (username, id) => apiClient.delete(`http://localhost:8080/users/${username}/todos/${id}`)

// export const RetrievePathVariableBean = (username) => apiClient.get(`http://localhost:8080/hello-world/path-variable/${username}`)