package ui.components.NameSelectScreen


class NamesScreenValues {
    fun getRandomFirstName():String{
        return getListFirstNames().random()
    }

    fun getRandomLastName():String{
        return getListLastNames().random()
    }

    fun getRandomCompanyName():String{
        return getListCompanyFirstNames().random() +
                " " + getListCompanyMiddleNames().random() +
                ", " + getListCompanyLastNames().random()
    }

    fun getListFirstNames():ArrayList<String>{
        var firstNameList = ArrayList<String>()

        firstNameList.add("James")
        firstNameList.add("Alex")
        firstNameList.add("Amos")
        firstNameList.add("Ellen")
        firstNameList.add("Malcolm")
        firstNameList.add("Jean-Luc")
        firstNameList.add("Sarah")
        firstNameList.add("Rick")
        firstNameList.add("Marty")
        firstNameList.add("Kaylee")
        firstNameList.add("Leia")

        return firstNameList
    }

    fun getListLastNames():ArrayList<String>{
        var lastNameList = ArrayList<String>()

        lastNameList.add("Holden")
        lastNameList.add("Reynolds")
        lastNameList.add("Pickard")
        lastNameList.add("Burton")
        lastNameList.add("Kirk")
        lastNameList.add("Connor")
        lastNameList.add("Deckard")
        lastNameList.add("Gordon")
        lastNameList.add("Organa")

        return lastNameList
    }

    fun getListCompanyFirstNames():ArrayList<String>{
        var companyFirstNameList = ArrayList<String>()

        companyFirstNameList.add("Quick")
        companyFirstNameList.add("General")
        companyFirstNameList.add("Aerospace")
        companyFirstNameList.add("Computer")
        companyFirstNameList.add("Electrics")

        return companyFirstNameList
    }

    fun getListCompanyMiddleNames():ArrayList<String>{
        var companyMiddleNameList = ArrayList<String>()

        companyMiddleNameList.add("Klean")
        companyMiddleNameList.add("Manufacturing")
        companyMiddleNameList.add("Harvesting")
        companyMiddleNameList.add("Resources")
        companyMiddleNameList.add("Mining")
        companyMiddleNameList.add("Sourcing")

        return companyMiddleNameList
    }

    fun getListCompanyLastNames():ArrayList<String>{
        //LLC, Inc, Corp, Ltd
        var companyLastNameList = ArrayList<String>()

        companyLastNameList.add("LLC")
        companyLastNameList.add("Inc")
        companyLastNameList.add("Corp")
        companyLastNameList.add("Ltd")

        return companyLastNameList
    }
}