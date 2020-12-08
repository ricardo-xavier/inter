package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador659")
public class Somador659 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
