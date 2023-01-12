import axios from "axios";
import {GET_ABOUT_US} from "./types";

export const getAboutUs = (companyName) => async dispatch => {

    axios.get(`/about/${companyName}`)
        .then(res => {
            dispatch ({
                type: GET_ABOUT_US,
                payload: res.data
            });
        });


}