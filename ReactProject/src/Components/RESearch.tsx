import React, { useState } from "react";

interface BikeSearchProps {
  onSearch: (searchTerm: string) => void;
}

const BikeSearch: React.FC<BikeSearchProps> = ({ onSearch }) => {
  const [searchTerm, setSearchTerm] = useState("");

  const handleSearch = (e:any) => {
    setSearchTerm(e.target.value);
    onSearch(e.target.value); 
  };

  return (
    <div className="mb-3" style={{ backgroundColor: 'lightgrey' }}>
      <input
        type="text"
        className="form-control"
        placeholder="Search bikes..."
        value={searchTerm}
        onChange={handleSearch}
      />
    </div>
  );
};

export default BikeSearch;
