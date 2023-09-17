import { useEffect, useState } from "react";
import { retrieveAllTodosForUsername } from "./api/TodoApiService";

export default function ListTodoComponent(){
    const today= new Date();
    const targetDate= new Date(today.getMonth(),today.getDay()+1,today.getFullYear())

    const [todos, setTodos] = useState([])


    
    function refreshTodos(){
        
    retrieveAllTodosForUsername("Rohan")
        .then(response => {
            setTodos(response.data)
        }
        )
        .catch(error => console.log(error))

    }

    useEffect(
        ()=>refreshTodos()
    )
  

    return(
        <div className="container">
            <h1>List of TODOs</h1>
            <div>
                
                <table className='table'>
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Task</td>
                            <td>Status</td>
                            <td>Target Date</td>
                        </tr>
                    </thead>

                    <tbody>
                        {
                            todos.map(
                                todo=>(
                                    <tr key={todo.id}>
                                        <td>{todo.id}</td>
                                        <td>{todo.description}</td>
                                        <td>{todo.done.toString()}</td>
                                        <td>{todo.targetDate.toString()}</td>
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