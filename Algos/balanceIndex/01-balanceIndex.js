//Steve's version (recursive)
const balanceIndex = (arr, sum=0, index=0) => {
    if(index>=arr.length) return -1
    for(let i=0;i<arr.length;i++){
        sum += arr[i]
    }
    let total = 0
    let i = 0
    sum-=arr[index]
    while(i<index){
        total += arr[i]
        i++
    }
    if(total == sum/2)return index
    else {
        index +=1
        return balanceIndex(arr, sum = 0, index)
    }
}
console.log(balanceIndex([1,2,4,9,20])) // -1
console.log(balanceIndex([4,1,2,4,9,-20,18])) // 3
console.log(balanceIndex([-2,5,7,0,3])) // 2

//Nicole's version
function balanceIndex(arr){
    let sum = 0;
    let sumLeft = arr[0];
    let sumRight = arr[1];

    for (let i =0; i < arr.length; i++) {
        sum += arr[i]

    }
    // sumRight is sum total minus sumleft minus index
    sumRight = sum - sumLeft - arr[1];

    for (let j=1; j < arr.length -1; j++) {
        // console.log(sumLeft, sumRight )
        if (sumLeft === sumRight){
        
            return j
        } else {
            sumLeft += arr[j];
            sumRight = sum - sumLeft - arr[j+1];

        }
    }
    return -1;
    // console.log(sum)
}


console.log(balanceIndex([1,2,4,9,20])) //-1 (means that there is no index where a balance occurs)
console.log(balanceIndex([4,1,2,4,9,-20,18])) //3 (means that there is a balance at index 3 occurs)
console.log(balanceIndex([-2,5,7,0,3])) // 2


//Brandon Flaherty
function balance(arr){
    // for(let pivot = 0; pivot < arr.length; pivot++){
    //     let left = 0;
    //     let right = 0;
    //     for(let i = 0; i < pivot; i++){
    //         left += arr[i];
    //     }
    //     for(let i = pivot + 1; i < arr.length; i++){
    //         right += arr[i];
    //     }
    //     if(left == right){
    //         return pivot;
    //     }
    // }
    // return -1;

    var right = 0;
    var left = 0;
    arr.forEach(x => {
        right += x;
    });
    for(let pivot = 0; pivot < arr.length; pivot++){
        right -= arr[pivot];
        if(left == right){
            return pivot;
        }
        left += arr[pivot];
    }
    return -1;
}

//Brandon Griffith
function balanceIndex(arr){
    let sum = 0;
    let sum2 = 0;
    let i = 0;
    while(i < arr.length){
        sum += arr[i];
        i++;
    }
    i = 0;
    while(i <= arr.length){
        sum = sum - arr[i];
        if(sum2==sum){
            return i;
        }
        sum2 += arr[i];
        i++;
    }
    return -1;
}

// Instructor_SaurabhD — Yesterday at 11:24 AM
// Here, a balance point is on an index, not between indices.
// Return the balance index where sums are equal on either side (exclude its own value). Return -1 if none exist. Ex.: [-2,5,7,0,3] → 2 , but [9,9] → -1



//[-2,5,7,0,3] --> 2


function balanceIndex(arr){
    //find the total (ex: 13) and put in variable
    let totalSum = 0;
    for(let i = 0; i<arr.length; i++){
        totalSum+= arr[i];
    }

    //create a variable to keep track of left side sum (arr[0] ex: -2) (leftsum = arr[0])
    let leftSideSum = arr[0]

    //go through the array starting at index 1 (b/c i know theres not gona be a balance at index 0)
    for(let i = 1; i<arr.length; i++){
        let rightSideSum = totalSum - arr[i] - leftSideSum
        //in each iteration of the loop, see if the left side sum === the right side sum from the current index
        if(leftSideSum === rightSideSum){
            //if the left sum and right sum ARE equal, we return the current index
            return i;
        }
        else{
            //if the left sum and right sum are not equal, we add to the left sum the value at current index before moving on to the next index
            leftSideSum+= arr[i]
        }
    }
    return -1; //if we go through the whole loop and we couldnt find matching left and right sum, then we return -1 saying that no index is the balance index
}


console.log(balanceIndex([1,2,4,9,20])) //-1 (means that there is no index where a balance occurs)
console.log(balanceIndex([4,1,2,4,9,-20,18])) //3 (means that there is a balance at index 3 occurs)
console.log(balanceIndex([-2,5,7,0,3])) // 2