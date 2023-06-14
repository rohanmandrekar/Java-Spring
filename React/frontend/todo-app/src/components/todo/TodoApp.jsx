import { useState } from 'react'
import {BrowserRouter, Routes, Route, useNavigate} from 'react-router-dom'
import './TodoApp.css'



export default function TodoApp(){
    return(
        <div className="TodoApp">
            
            <BrowserRouter>
                <Routes>
                    <Route path='/' element={<LoginComponent/>}></Route>
                    <Route path='/login' element={<LoginComponent/>}></Route>
                    <Route path='/welcome' element={<WelcomeComponent/>}></Route>
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

            navigate('/welcome')
        }
        else{
            setShowError(true)
            setShowSuccess(false)
        }
    }

    return(
        <div className="Login">

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
    return(
        <div className="Welcome">
            Welcome Component
        </div>
    )
}