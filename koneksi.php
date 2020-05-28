<?php 
$server = 'localhost';
$username = 'id12086145_root';
$password  = '8G&w/6Sh)SrwOvte';
$dbname = 'id12086145_uasyoga';

//koneksi
$conn = new mysqli ($server, $username, $password,$dbname);

//check koneksi
if ($conn->connect_error){
    die("Connection Failed".$conn->connect_error);
}
$sql= "SELECT * FROM tmenu";
$result = $conn->query($sql);
$data=array();

if($result->num_rows>0){
    while ($row=$result->fetch_assoc()){
        $data[]=$row;
    }
}
else{
    echo"data kosong";
}
echo json_encode($data);
$conn->close();
?>