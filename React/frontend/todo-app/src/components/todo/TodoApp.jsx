
import {BrowserRouter, Routes, Route, Navigate} from 'react-router-dom'
import LogoutComponent from './LogoutComponent'
import LoginComponent from './LoginComponent'
import ListTodoComponent from './ListTodoComponent'
import ErrorComponent from './ErrorComponent'
import WelcomeComponent from './WelcomeComponent'
import HeaderComponent from './HeaderComponent'
import AuthProvider from './security/AuthContext'
import TodoComponent from './TodoComponent'
import { useAuth } from './security/AuthContext'

// import FooterComponent from './FooterComponent'
import './TodoApp.css'

function AuthenticatedRoute({children}){
    const authContext=useAuth()
    if (authContext.isAuthenticated)
        return children
    else return <Navigate to="/"/>    
}


export default function TodoApp(){
    return(
        <div className="TodoApp">
            <AuthProvider>
            <BrowserRouter>
                <HeaderComponent/>
                <Routes>
                    <Route path='/' element={<LoginComponent/>}></Route>
                    <Route path='/login' element={<LoginComponent/>}></Route>
                    
                    <Route path='/welcome/:username' element={
                    <AuthenticatedRoute><WelcomeComponent/></AuthenticatedRoute>    
                    
                    }></Route>
                    <Route path='/todos' element={
                    <AuthenticatedRoute><ListTodoComponent/></AuthenticatedRoute>  
                    }></Route>

                    <Route path='/todo/:id' element={
                        <AuthenticatedRoute>
                            <TodoComponent></TodoComponent>
                        </AuthenticatedRoute>
                    }></Route>

                    <Route path='/logout' element={
                    <AuthenticatedRoute><LogoutComponent/></AuthenticatedRoute>  
                    }></Route>

                    <Route path='*' element={<ErrorComponent/>}></Route>
                </Routes>
                {/* <FooterComponent/> */}
            </BrowserRouter>
            </AuthProvider>
            
            
            
        </div>
    )

}










