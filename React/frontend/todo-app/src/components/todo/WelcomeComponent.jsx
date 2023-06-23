import { useParams,Link } from "react-router-dom"
import axios from 'axios'

export default function WelcomeComponent(){

    const {username}= useParams()
    var password='pass'
    var username1='user'

    var basicAuth= 'Basic' + btoa(username1 + ':' + password)
    function callHelloWorld(){
        axios.get('http://localhost:8080/hello-world',{}, {
            headers:{Authorization: + 'Basic dXNlcjpwYXNz'}

        })
            .then((response)=>successfulResponse(response))
            .catch((error)=>errorResponse(error))
            .finally( ()=>console.log('cleanup'))
    }
    function successfulResponse(response){
        console.log(response)
    }
    function errorResponse(error){
        console.log(error)
    }

    return(
        <div className="Welcome">
            <h1>Welcome {username}</h1>
            <h2><Link to="/todos">Go to TODOs</Link></h2> 
            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorld}>Hello World</button>
            </div>
        </div>
    )
}

