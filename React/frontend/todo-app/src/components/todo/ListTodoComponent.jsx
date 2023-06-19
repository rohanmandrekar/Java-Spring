export default function ListTodoComponent(){
    const today= new Date();
    const targetDate= new Date(today.getMonth(),today.getDay()+1,today.getFullYear())
    const todos= [
        {id:1, task: 'Learn AWS', done:false, targetDate:targetDate},
        {id:2, task: 'Interview prep', done:false, targetDate:targetDate}, 
        {id:3, task: 'Apply for jobs', done:false, targetDate:targetDate}]
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
                                        <td>{todo.task}</td>
                                        <td>{todo.done.toString()}</td>
                                        <td>{todo.targetDate.toDateString()}</td>
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