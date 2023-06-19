import { useState } from 'react'
import {BrowserRouter, Routes, Route, useNavigate,useParams, Link} from 'react-router-dom'
import './TodoApp.css'



export default function TodoApp(){
    return(
        <div className="TodoApp">
            
            <BrowserRouter>
                <HeaderComponent/>
                <Routes>
                    <Route path='/' element={<LoginComponent/>}></Route>
                    <Route path='/login' element={<LoginComponent/>}></Route>
                    <Route path='/welcome/:username' element={<WelcomeComponent/>}></Route>
                    <Route path='/todos' element={<ListTodoComponent/>}></Route>

                    <Route path='/logout' element={<LogoutComponent/>}></Route>
                    <Route path='*' element={<ErrorComponent/>}></Route>
                </Routes>
                <FooterComponent/>
            </BrowserRouter>
            
            
            
        </div>
    )

}

function LoginComponent(){

    const [username, setUser] = useState("user")
    const [password,setPassword]=useState("pass")
    const [showError,setShowError]=useState(false)
    const navigate= useNavigate()

    function handleUsernameChange(event){
    
        setUser(event.target.value)
    }

    function handlePasswordChange(event){
    
        setPassword(event.target.value)
    }

    function handleSubmit(){
        if(username==='user' && password==='pass'){

            navigate(`/welcome/${username}`)
        }
        else{
            setShowError(true)
        }
    }

    return(
        <div className="Login">
            <h1>Login</h1>

            {showError && <div className='errorMessage' style={{color:"red"}}>Authention Failed</div>}
            
            <div className="LoginForm">
                <div>
                    <label>Username</label>
                    <input type="text" name= "username" value={username} onChange={handleUsernameChange}/>
                </div>

                <div>
                    <label>Password</label>
                    <input type="password" name= "password" value={password} onChange={handlePasswordChange}/>
                </div>

                <div>
                    <button type="button" name="login" onClick={handleSubmit} >Login</button>
                </div>

            </div>
        </div>
    )
}




function WelcomeComponent(){

    const {username}= useParams()

    return(
        <div className="Welcome">
            <h1>Welcome {username}</h1>
          <h2><Link to="/todos">Go to TODOs</Link></h2> 
        </div>
    )
}

function ErrorComponent(){
    return(
        <div className="ErrorComponent">
            <h1 style={{color:"red"}}>We are working on this!</h1>
            <div>Reach out to our team at 123-456-7890</div>
        </div>
    )
}

function ListTodoComponent(){
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

function HeaderComponent(){
    return(
        <header className="border-bottom border-light border-5 mb-5 p-2">
        <div className="container">
            <div className="row">
                <nav className="navbar navbar-expand-lg">
                    <a className="navbar-brand ms-2 fs-2 fw-bold text-black" href="https://rohanmandrekar.netlify.app/">Rohan Mandrekar</a>
                    <div className="collapse navbar-collapse">
                        <ul className="navbar-nav">
                            <li className="nav-item fs-5"><Link className="nav-link" to="/welcome/user">Home</Link></li>
                            <li className="nav-item fs-5"><Link className="nav-link" to="/todos">Todos</Link></li>
                        </ul>
                    </div>
                    <ul className="navbar-nav">
                        <li className="nav-item fs-5"><Link className="nav-link" to="/login">Login</Link></li>
                        <li className="nav-item fs-5"><Link className="nav-link" to="/logout">Logout</Link></li>
                    </ul>
                </nav>
            </div>
        </div>
    </header>

    )
}

function FooterComponent(){
    return(
        <footer className='footer'>
            <div className='container'>
                Footer
           </div>
        </footer>
    )
}

function LogoutComponent(){
    return(
        <div className='LogoutComponent'>
            <h1>You have successfully logged out</h1>
        </div>
    )
}