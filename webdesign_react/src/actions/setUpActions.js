import axios from "axios";
import {CREATE_COMPANY} from "./types"

export const createCompany = (company, history) => async dipatch => {
    await axios.post("/setup/company", company);
    history.push('/');
}