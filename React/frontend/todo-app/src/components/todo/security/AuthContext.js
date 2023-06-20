import { createContext, useContext, useState } from "react";

export const AuthContext=createContext()

export const useAuth=()=> useContext(AuthContext)

export default function AuthProvider({children}){
    const [number,setNumber] = useState(10)

    setInterval(
        () => setNumber(number+1), 100
    )
    return(
        <AuthContext.Provider value={{number}}>
            {children}
        </AuthContext.Provider>
    )
}