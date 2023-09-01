import { useParams,Link } from "react-router-dom"
import { useState } from "react"
import { retrieveHelloWorldBean, RetrievePathVariableBean } from "./api/HelloWorldApiService"



export default function WelcomeComponent(){

    const {username}= useParams()

    const [message, setMessage] = useState(null)


    function successfulResponseBean(response){
        console.log(response)
        setMessage(response.data.message)
    }

    function errorResponse(error){
        console.log(error)
    }

    function callHelloWorldBean(){
        retrieveHelloWorldBean()
            .then((response)=>successfulResponseBean(response))
            .catch((error)=>errorResponse(error))
            .finally( ()=>console.log('cleanup'))
    }

    function callHelloWorldPathVariable(){
        RetrievePathVariableBean("Rohan")
            .then((response)=>successfulResponseBean(response))
            .catch((error)=>errorResponse(error))
            .finally( ()=>console.log('cleanup'))
    }

    return(
        <div className="Welcome">
            <h1>Welcome {username}</h1>
            <h2><Link to="/todos">Go to TODOs</Link></h2> 

            

            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorldBean}>Hello World Bean</button>
            </div>

            <div className="text-info">{message}</div>

            <div>
                <button className="btn btn-success m-5" onClick={callHelloWorldPathVariable}>Hello World Path Variable</button>
            </div>



             
        </div>
    )
}

