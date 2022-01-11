import MovieCard from "../../components/MovieCard";


import Pagination from "../../components/Pagination";



function Listing() {
    return (
        <>
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