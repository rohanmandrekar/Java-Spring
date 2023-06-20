import { useAuth } from './security/AuthContext'



export default function LogoutComponent(){
    const authContext=useAuth()
    authContext.setAuthenticated(false)
    return(
        <div className='LogoutComponent'>
            <h1>You have successfully logged out</h1>
            
        </div>
    )
}