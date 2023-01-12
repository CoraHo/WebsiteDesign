import {GET_ABOUT_US} from "../actions/types";

const initialState = {
    company: {},
    staff: []
}

export default function companyFunc(state = initialState, action) {
    switch (action.type) {
        case GET_ABOUT_US:
            return {
                ...state,
                company: action.payload
            }

        default:
            return state;
    }
}