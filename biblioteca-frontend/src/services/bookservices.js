import { http } from './api'

export default{
    findAll: () => {
        return http.get('books');
    },
    findById: (books) => {
        return http.get(`books/${books}`, { data: books });
    },
    save: (books) => {
        return http.post('books', books);
    },
    delete: (books) => {
        return http.delete(`books/${books}`, { data: books });
    },
    update: (books) => {
        return http.put(`books`, books);
    }
}
