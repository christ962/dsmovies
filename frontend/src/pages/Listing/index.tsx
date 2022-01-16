import MovieCard from "../../components/MovieCard";


import Pagination from "../../components/Pagination";
import {useState, useEffect} from "react";
import { BASE_URL } from "../../utils/requests";
import axios from "axios";
import {MoviePage} from "../../types/Movie";


function Listing() {
   
   const [pageNumber, setPageNumber] = useState(0);
   
   useEffect(() =>{
   axios.get(`${BASE_URL}/movies?size=12&page=0`)
   .then(response =>{
       const data = response.data as MoviePage;
       setPageNumber(data.number)
   });
},[]);
    return (
        <>
             <p>{pageNumber}</p>  
            <Pagination />

            <div className="container">
                <div className="row">
                    <div className="col-sm col-lg-4 col-xl-3 mb-3"></div>
                    <MovieCard />
                </div>
                <div className="row">
                    <div className="col-sm col-lg-4 col-xl-3  mb-3"></div>
                    <MovieCard />
                </div>
                <div className="row">
                    <div className="col-sm col-lg-4 col-xl-3 mb-3"></div>
                    <MovieCard />
                </div>
                <div className="row">
                    <div className="col-sm col-lg-4 col-xl-3 mb-3"></div>
                    <MovieCard />
                </div>
            </div>

        </>

    );
}
export default Listing;