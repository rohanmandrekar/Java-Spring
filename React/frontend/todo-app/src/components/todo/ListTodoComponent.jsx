import { useEffect, useState } from "react";
import { deleteTodoApi, retrieveAllTodosForUsernameApi } from "./api/TodoApiService";
import { useAuth } from "./security/AuthContext";

export default function ListTodoComponent(){
    const authContext=useAuth()
    const username =authContext.username
    const today= new Date();
    const targetDate= new Date(today.getMonth(),today.getDay()+1,today.getFullYear())
    const [message,setMessage] = useState(null)
    const [todos, setTodos] = useState([])


    
    function refreshTodos(){
        
    retrieveAllTodosForUsernameApi(username)
        .then(response => {
            setTodos(response.data)
        }
        )
        .catch(error => console.log(error))

    }

    useEffect(
        ()=>refreshTodos()
    )
    
    function deleteTodo(id){
        deleteTodoApi(username,id)
        .then(
            () => {
                setMessage("Deleted Todo")
                refreshTodos()
            })
        .catch(error => console.log("error"))

    }

    return(
        <div className="container">
            <h1>List of TODOs</h1>
            {message && <div className="alert alert-warning"> {message} </div>}
            <div>
                
                <table className='table'>
                    <thead>
                        <tr>
                            <th>Task</th>
                            <th>Status</th>
                            <th>Target Date</th>
                            <th></th>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            todos.map(
                                todo=>(
                                    <tr key={todo.id}>
                                        <td>{todo.description}</td>
                                        <td>{todo.done.toString()}</td>
                                        <td>{todo.targetDate.toString()}</td>
                                        <td><button className="btn btn-warning" onClick={()=>deleteTodo(todo.id)}>Delete</button></td>
                                    </tr> 
                                )
                            )
                        }
                    </tbody>

                </table>

            </div>
        </div>
    )
}