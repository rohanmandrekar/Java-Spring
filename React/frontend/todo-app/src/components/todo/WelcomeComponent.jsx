import { useParams,Link } from "react-router-dom"
import axios from 'axios'
import { useState } from "react"

export default function WelcomeComponent(){

    const {username}= useParams()

    const [message, setMessage] = useState(null)


    function callHelloWorld(){
        axios.get('http://localhost:8080/hello-world')
            .then((response)=>successfulResponse(response))
            .catch((error)=>errorResponse(error))
            .finally( ()=>console.log('cleanup'))
    }
    function successfulResponse(response){
        console.log(response)
        setMessage(response.data)
    }

    function successfulResponseBean(response){
        console.log(response)
        setMessage(response.data.message)
    }

    function errorResponse(error){
        console.log(error)
    }

    function callHelloWorldBean(){
        axios.get('http://localhost:8080/hello-world-bean')
            .then((response)=>successfulResponseBean(response))
            .catch((error)=>errorResponse(error))
            .finally( ()=>console.log('cleanup'))
    }

    return(
        <div className="Welcome">
            <h1>Welcome {username}</h1>
            <h2><Link to="/todos">Go to TODOs</Link></h2> 
            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorld}>Hello World</button>
            </div>
            <div className="text-info">{message}</div>

            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorldBean}>Hello World Bean</button>
            </div>
        </div>
    )
}



