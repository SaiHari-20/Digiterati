import React from "react";

interface Bike {
  Image: string;
  Model: string;
  Year: string;
  Price : string;
}

const RECard = ({ bike }: { bike: Bike }) => {
  return (
    <div className="col-md-3 col-sm-6" >
      <div className="card mb-4">
        <img src={bike.Image} className="card-img-top" alt={bike.Model} />
        <div className="card-body">
          <h5 className="card-title">{bike.Model}</h5>
          <p className="card-text">Year: {bike.Year}</p>
          <p className="card-text">On-Road Price: {bike.Price}</p>
        </div>
      </div>
    </div>
  );
};

export default RECard;
