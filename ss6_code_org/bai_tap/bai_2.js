
function cals()
{

    let doC=parseInt(document.getElementById('Celsius').value)
    let doF= doC*9/5+32
    document.getElementById('Fahrenheit').value=doF;
}
function cals1()
{
    const pi=3.14;
    let R=parseInt(document.getElementById('radius').value)
    let S=pi*R*R;
    document.getElementById('area').value=S;
    let C=pi*2*R;
    document.getElementById('chuVi').value=C;
}
