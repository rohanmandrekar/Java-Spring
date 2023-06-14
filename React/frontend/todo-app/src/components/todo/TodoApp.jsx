import { useState } from 'react'
import {BrowserRouter, Routes, Route, useNavigate,useParams} from 'react-router-dom'
import './TodoApp.css'



export default function TodoApp(){
    return(
        <div className="TodoApp">
            
            <BrowserRouter>
                <Routes>
                    <Route path='/' element={<LoginComponent/>}></Route>
                    <Route path='/login' element={<LoginComponent/>}></Route>
                    <Route path='/welcome/:username' element={<WelcomeComponent/>}></Route>
                    <Route path='*' element={<ErrorComponent/>}></Route>
                </Routes>
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