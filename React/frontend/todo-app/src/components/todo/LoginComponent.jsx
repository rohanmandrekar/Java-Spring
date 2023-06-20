import { useState } from 'react'
import { useNavigate } from "react-router-dom"
import { useAuth } from './security/AuthContext'


export default function LoginComponent(){

    const [username, setUser] = useState("user")
    const [password,setPassword]=useState("pass")
    const [showError,setShowError]=useState(false)
    const navigate= useNavigate()
    const authContext=useAuth()

    function handleUsernameChange(event){
    
        setUser(event.target.value)
    }

    function handlePasswordChange(event){
    
        setPassword(event.target.value)
    }

    function handleSubmit(){
        if(authContext.login(username,password)){
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
