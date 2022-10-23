package cs321.create;

import cs321.search.GeneBankSearchBTreeArgumentException;

public class GeneBankCreateBTreeArguments
{
    private final boolean useCache;
    private final int degree;
    private final String gbkFileName;
    private final int subsequenceLength;
    private final int cacheSize;
    private final int debugLevel;


    public GeneBankCreateBTreeArguments(String args[]) throws GeneBankSearchBTreeArgumentException
    {
        //args length checks
        if(args.length < 4)
        {
            throw new GeneBankSearchBTreeArgumentException("Too few arguments.");
        }
        if(args.length > 6)
        {
            throw new GeneBankSearchBTreeArgumentException("Too many arguments.");
        }

        //gets the use cache
        int cacheUse = Integer.parseInt(args[0]);
        //creates a boolean for cache or no cache
        //sets cache or not
        boolean usingCache = false;
        if(cacheUse == 0)
        {
            usingCache = false;
        }
        if(cacheUse == 1)
        {
            usingCache = true;
        }
        this.useCache = usingCache;
        //gets degree number
        int degreez;
        degreez = Integer.parseInt(args[1]);
        if(degreez == 0)
        {
            degreez = 156;
        }
        this.degree = degreez;
        //gets filename
        this.gbkFileName = args[2];
        //determines sequence length
        this.subsequenceLength = Integer.parseInt(args[3]);
        if(this.subsequenceLength > 31 || subsequenceLength < 1)
        {
            throw new GeneBankSearchBTreeArgumentException("Sequence length must be between 1 and 31 (inclusive)");
        }

        //optional (needed since final int)
        int debugger;
        int cacheSizes;
        debugger = 0;
        cacheSizes = 0;

        if(args.length > 4)
        {
            if(args.length == 5) //optional field's check for length of five (debug or cache size)
            {
                if(cacheUse == 0)//not using cache so debug
                {
                    debugger = Integer.parseInt(args[4]);
                    if(debugger > 1)
                    {
                        throw new GeneBankSearchBTreeArgumentException("Debug Level is incorrect: 0 or 1.");
                    }
                    cacheSizes = 0;
                }
                if(cacheUse == 1)//using cache and no debug
                {
                    cacheSizes = Integer.parseInt(args[4]);
                    if(cacheSizes < 100 || cacheSizes > 501) //cache incorrect size
                    {
                        throw new GeneBankSearchBTreeArgumentException("Cache size is incorrect. Size: 100-500.");
                    }
                    debugger = 0;
                }
            }
            if(args.length == 6) //full arguments
            {
                cacheSizes = Integer.parseInt(args[4]);
                debugger = Integer.parseInt(args[5]);
                if(debugger > 1 || debugger < 0)
                {
                    throw new GeneBankSearchBTreeArgumentException("Debug Level is incorrect: 0 or 1.");
                }
                if(cacheUse == 1) {
                    if (cacheSizes < 100 || cacheSizes > 501) //cache incorrect size
                    {
                        throw new GeneBankSearchBTreeArgumentException("Cache size is incorrect. Size: 100-500.");
                    }
                }
            }
        }
        this.debugLevel = debugger;
        this.cacheSize = cacheSizes;
    }

    public GeneBankCreateBTreeArguments(boolean useCache, int degree, String gbkFileName, int subsequenceLength, int cacheSize, int debugLevel)
    {
        this.useCache = useCache;
        this.degree = degree;
        this.gbkFileName = gbkFileName;
        this.subsequenceLength = subsequenceLength;
        this.cacheSize = cacheSize;
        this.debugLevel = debugLevel;
    }

    @Override
    public boolean equals(Object obj)
    {
        //this method was generated using an IDE
        if (this == obj)
        {
            return true;
        }
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        GeneBankCreateBTreeArguments other = (GeneBankCreateBTreeArguments) obj;
        if (cacheSize != other.cacheSize)
        {
            return false;
        }
        if (debugLevel != other.debugLevel)
        {
            return false;
        }
        if (degree != other.degree)
        {
            return false;
        }
        if (gbkFileName == null)
        {
            if (other.gbkFileName != null)
            {
                return false;
            }
        }
        else
        {
            if (!gbkFileName.equals(other.gbkFileName))
            {
                return false;
            }
        }
        if (subsequenceLength != other.subsequenceLength)
        {
            return false;
        }
        if (useCache != other.useCache)
        {
            return false;
        }
        return true;
    }


    public boolean isUseCache() {
        return useCache;
    }

    public int getDegree() {
        return degree;
    }

    public String getGbkFileName() {
        return gbkFileName;
    }

    public int getSubsequenceLength() {
        return subsequenceLength;
    }

    public int getCacheSize() {
        return cacheSize;
    }

    public int getDebugLevel() {
        return debugLevel;
    }

    @Override
    public String toString()
    {
        //this method was generated using an IDE
        return "GeneBankCreateBTreeArguments{" +
                "useCache=" + useCache +
                ", degree=" + degree +
                ", gbkFileName='" + gbkFileName + '\'' +
                ", subsequenceLength=" + subsequenceLength +
                ", cacheSize=" + cacheSize +
                ", debugLevel=" + debugLevel +
                '}';
    }
}
