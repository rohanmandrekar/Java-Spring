import { useParams } from "react-router-dom"
import { useAuth } from "./security/AuthContext"
import { retriveTodoByIdApi } from "./api/TodoApiService"
import { useEffect, useState } from "react"

export default function TodoComponent(){
    const {id} = useParams()
    const authContext = useAuth()
    const username=authContext.username

    const [description,setDescription] = useState('')

    useEffect(
        ()=>retrieveTodo(id),
        [id]
    )

    function retrieveTodo(id){
        retriveTodoByIdApi(username, id)
        .then(response=>setDescription(response.data.description))
        .catch(error=>console.log(error))
    }
    return(
        <div className="container">
            <h1>Enter Todo Details</h1>
            <div>
                description: {description}
            </div>
        </div>
    )
}