package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador841")
public class Somador841 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
