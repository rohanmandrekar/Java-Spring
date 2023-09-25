import { useEffect, useState } from "react";
import { deleteTodoApi, retrieveAllTodosForUsernameApi } from "./api/TodoApiService";
import { useAuth } from "./security/AuthContext";
import { useNavigate } from "react-router-dom";

export default function ListTodoComponent(){
    const authContext=useAuth()
    const username =authContext.username
    const today= new Date();
    const targetDate= new Date(today.getMonth(),today.getDay()+1,today.getFullYear())
    const [message,setMessage] = useState(null)
    const [todos, setTodos] = useState([])
    const navigate=useNavigate()


    
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

    function updateTodo(id){
        navigate(`/todo/${id}`)

    }

    function addNewTodo(){
        navigate(`/todo/-1`)
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
                                        <td><button className="btn btn-success" onClick={()=>updateTodo(todo.id)}>Update</button></td>
                                    </tr> 
                                )
                            )
                        }
                    </tbody>

                </table>

            </div>
            <div className="btn btn-success m-4" onClick={addNewTodo}>Add New Task</div>
        </div>
    )
}