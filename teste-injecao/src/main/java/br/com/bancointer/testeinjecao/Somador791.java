package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador791")
public class Somador791 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
