import {combineReducers} from "redux";
import companyReducers from "./companyReducers";

export default combineReducers({
    companyInfo: companyReducers
})