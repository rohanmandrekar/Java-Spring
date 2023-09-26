import axios from "axios";

const apiCLient = axios.create(
    {
        baseURL: 'http://localhost:8080'
    }
)

export const executeBasicAuthenticationService = (token) => apiCLient.get('/basicauth',
{
    headers: {
        Authorization: token
    }
})