import FirstComponent from './FirstComponent';
import SecondComponent from './SecondComponent';
import ThirdComponent from './ThirdComponent';
import FourthComponent from './FourthComponent';
import {FifthComponent} from './FirstComponent';
import LearningJavascript from './LearningJavaScript';


export default function LearningComponent(){
    return(
        <div className='LearningCmponent'>
            <FirstComponent></FirstComponent>
            <SecondComponent></SecondComponent>
            <ThirdComponent/>
            <FourthComponent/>
            <FifthComponent/>
            <LearningJavascript/>
        </div>
    );

}
